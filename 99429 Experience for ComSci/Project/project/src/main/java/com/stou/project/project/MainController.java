package com.stou.project.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    @Autowired private MessageService messageService;

    @GetMapping("/")
    public String getIndex(Model model, @Param("keyword") String keyword) {
        List<Message> listMessages = messageService.listAll(keyword);
        model.addAttribute("messages", listMessages);
        return "index";
    }
    
    @GetMapping("/newmessage")
    public String showMessageForm() {
        return "messageform";
    }

    @PostMapping("/addmessage")
    public String postMessageForm(@ModelAttribute("messages") Message message) {
        messageService.addMessage(message);
        return "redirect:/";
    }
    
    @GetMapping("/deletemessage/{id}")
    public String deleteMessage(@PathVariable("id") Integer id, Model model) {
        Message foundmessage = messageService.findMessageByID(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        messageService.deleteMessage(foundmessage);
        return "redirect:/";
    }
    
    @GetMapping("/editmessage/{id}")
    public String showUpdateMessageForm(@PathVariable("id") Integer id, Model model) {
        Message message = messageService.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("message", message);
        return "updatemessageform";
    }
    
    @PostMapping("/updatemessage/{id}")
    public String updateMessageForm(@PathVariable("id") Integer id, @ModelAttribute("messages") Message message) {
        messageService.save(message);
        return "redirect:/";
    }
}
