package com.example.desktime.serviceimpl;

import com.example.desktime.model.User;
import com.example.desktime.repository.UserRepository;
import com.example.desktime.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUserData(User user) {


        User userdata = new User();

        userdata.setUsername(user.getUsername());
        userdata.setLoginDate(user.getLoginDate());
        userdata.setLoginTime(user.getLoginTime());
        userdata.setLoginTimeConvention(user.getLoginTimeConvention());
        userRepository.save(userdata);

    }
}
