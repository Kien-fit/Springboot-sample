package com.kienjd.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.kienjd.dto.request.UserRequestDTO;
import com.kienjd.dto.response.PageResponse;
import com.kienjd.dto.response.UserDetailResponse;
import com.kienjd.util.UserStatus;

public interface UserService {

    UserDetailsService userDetailsService();

    long saveUser(UserRequestDTO request);

    void updateUser(long userId, UserRequestDTO request);

    void changeStatus(long userId, UserStatus status);

    void deleteUser(long userId);

    UserDetailResponse getUser(long userId);

    PageResponse<?> getAllUsers(int pageNo, int pageSize);
}
