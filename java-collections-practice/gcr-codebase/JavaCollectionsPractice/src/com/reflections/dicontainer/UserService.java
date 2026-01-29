package com.reflections.dicontainer;

public class UserService {

    @Inject
    private UserRepository userRepository;

    public void registerUser() {
        userRepository.save();
    }
}

