package com.Watch_Shop.controller;

import org.springframework.stereotype.Controller;
import com.Watch_Shop.model.User;
import com.Watch_Shop.service.LoginService;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
import java.util.List;
import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/Login")
    public String Login(Model model) {
        List<User> users = loginService.getAllUsers();
        model.addAttribute("users", users);
        return "Login/Login";
    }

    @PostMapping("/addUser")
    public String CreateAccount(@RequestParam String email, @RequestParam String password,
            @RequestParam String fullName, @RequestParam String phone,
            @RequestParam String address) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setFullName(fullName);
        user.setPhone(phone);
        user.setAddress(address);
        loginService.saveUser(user);
        return "redirect:/Login";
    }

    @PostMapping("/doLogin")
    public String login(@RequestParam String email, @RequestParam String password, Model model,
            HttpSession session, RedirectAttributes redirectAttributes) {
        Optional<User> user = loginService.Login(email, password);
        if (user.isPresent()) {
            session.setAttribute("user", user.get());
            return "redirect:/";
        } else {
            redirectAttributes.addFlashAttribute("error", "Email or password is incorrect");
            return "redirect:/login";
        }
    }

    @GetMapping("/")
    public String Home(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/Login";
        }
        model.addAttribute("user", user);
        return "/index";
    }
}
