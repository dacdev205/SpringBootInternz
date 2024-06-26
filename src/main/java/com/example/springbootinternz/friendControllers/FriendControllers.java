package com.example.springbootinternz.friendControllers;

import com.example.springbootinternz.service.FriendService;
import com.example.springbootinternz.model.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendControllers {

    @Autowired
    private FriendService friendService;
    @GetMapping("/friends")
    public List<Friend> getFriends() {
        return friendService.getFriends();
    }

    @PostMapping("/friends/addFriend")
    public void addFriend(@RequestBody  Friend friend) {
        friendService.addFriend(friend);
    }

    @PutMapping("/friends/{id}/edit")
    public void updateFriend(@PathVariable("id") Friend friend) {
        friendService.updateFriend(friend);
    }

    @DeleteMapping("/friends/{id}/delete")
    public void deleteFriend(Integer Id, @PathVariable String id) {
        friendService.deleteFriend(Id);
    }
}
