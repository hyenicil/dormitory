package com.example.dormitory.service.business;

import com.example.dormitory.entity.User;
import com.example.dormitory.repository.UserRepository;
import com.example.dormitory.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser ( User user){
        System.out.println(user.getFullName() + "kaydedildi");
        return userRepository.save(user);
    }

}
