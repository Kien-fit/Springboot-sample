package com.kienjd.controller;

import com.kienjd.dto.response.ResponseData;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.kienjd.dto.request.UserRequestDTO;

import java.util.List;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

    @PostMapping("/")
    public ResponseData<Integer> addUser(@Valid @RequestBody UserRequestDTO user) {
        System.out.println("Request add user " + user.getFirstName());
        return new ResponseData<>(HttpStatus.CREATED.value(), "User added successfully,", 1);
    }

    @PutMapping("/{userId}")
    public ResponseData<?> updateUser(@PathVariable @Min(1) int userId, @Valid @RequestBody UserRequestDTO user) {
        System.out.println("Request update userId=" + userId);
        return new ResponseData<>(HttpStatus.ACCEPTED.value(), "User updated successfully");
    }

    @PatchMapping("/{userId}")
    public ResponseData<?> updateStatus(@Min(1) @PathVariable int userId, @RequestParam boolean status) {
        System.out.println("Request change status, userId=" + userId);
        return new ResponseData<>(HttpStatus.ACCEPTED.value(), "User's status changed successfully");
    }

    @DeleteMapping("/{userId}")
    public ResponseData<?> deleteUser(@PathVariable @Min(value = 1, message = "userId must be greater than 0") int userId) {
        System.out.println("Request delete userId=" + userId);
        return new ResponseData<>(HttpStatus.NO_CONTENT.value(), "User deleted successfully");
    }

    @GetMapping("/{userId}")
    public ResponseData<UserRequestDTO> getUser(@PathVariable @Min(1) int userId) {
        System.out.println("Request get user detail, userId=" + userId);

            return new ResponseData<>(HttpStatus.OK.value(), "user", new UserRequestDTO("Kien", "Jd", "admin@kienjd.vn", "0123456789"));
    }

    @GetMapping("/list")
    public ResponseData<List<UserRequestDTO>> getAllUser(@RequestParam(defaultValue = "0", required = false) int pageNo,
                                           @Min(10) @RequestParam(defaultValue = "20", required = false) int pageSize) {
        return new ResponseData<>(HttpStatus.OK.value(), "users", List.of(new UserRequestDTO("Kien", "Jd", "admin@kienjd.vn", "0123456789"),
                new UserRequestDTO("Leo", "Messi", "leomessi@email.com", "0123456456")));
    }
}
