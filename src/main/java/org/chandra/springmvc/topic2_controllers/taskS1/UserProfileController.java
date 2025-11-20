package org.chandra.springmvc.topic2_controllers.taskS1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserProfileController {

    @GetMapping({"","/"})
    public String getAllUsers(){
        return "All users returned";
    }

    @GetMapping("/{userId}")
    public String getUserById(@PathVariable(name = "userId") Integer userId){
        return "User ID: " +  userId;
    }

    @GetMapping("/{userId}/profile")
    public String getUserProfile(@PathVariable(name = "userId")Integer userId){
        return "Profile of user: " + userId;
    }

    @GetMapping("/filter")
    public String filterUsers(@RequestParam(required = false, defaultValue = "all") String role,
                              @RequestParam(required = false, defaultValue = "true") boolean active){
        return "Role: " + role + ", active: " + active;
    }

    @GetMapping(value = "/admin", headers = "X-ADMIN-ACCESS=true")
    public String getAdminUsers(){
        return "Admin access granted";
    }

    @GetMapping({"/stats", "/metrics"})
    public String getUserStats(){
        return "User statistics displayed";
    }

    @RequestMapping("/**")
    public String fallback(){
        return "Users fallback";
    }
}
