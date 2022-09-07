package com.example.blog.controller;

import com.example.blog.entity.Blog;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.parameters.P;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public String listBlog(Model model,
                           @PageableDefault(size = 5) Pageable pageable,
                           @RequestParam Optional<String> name,
                           Principal principal) {
        String keyName = name.orElse("");
        Page<Blog> page = blogService.findAll(pageable);
        model.addAttribute("blogList", page);
        model.addAttribute("category", categoryService.findAllCategory());
        model.addAttribute("keyVal", keyName);
        if (principal==null){
            return "/blog_list";
        }
        User loginedUser = (User) ((Authentication) principal).getPrincipal();
        model.addAttribute("userinfo",loginedUser.getAuthorities());
        return "/blog_list";
    }
//
    @GetMapping("/view-blog/{id}")
    public ModelAndView viewBlog(@PathVariable Integer id) {
        System.out.println(id);
        ModelAndView modelAndView = new ModelAndView("/view");
        modelAndView.addObject("blog", blogService.findById(id));
        return modelAndView;
    }

    @GetMapping("/showFormCreate")
    public ModelAndView formCreateBlog() {
        ModelAndView modelAndView = new ModelAndView("/blog_create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("category", categoryService.findAllCategory());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createBlog(@ModelAttribute Blog blog) {
        ModelAndView modelAndView = new ModelAndView("/blog_create");
        blogService.save(blog);
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView formEditBlog(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("/blog_edit");
        Blog blog = blogService.findById(id);
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("category", categoryService.findAllCategory());
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView editBlog(@ModelAttribute Blog blog) {
        ModelAndView modelAndView = new ModelAndView("redirect:/blog/list");
        blogService.save(blog);
        return modelAndView;
    }

    @PostMapping("/delete")
    public String deleteBlog(@RequestParam Integer id) {
        blogService.remove(id);
        return "redirect:/blog/list";
    }


}
