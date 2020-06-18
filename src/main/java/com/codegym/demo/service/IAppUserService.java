package com.codegym.demo.service;

import com.codegym.demo.model.AppUser;

public interface IAppUserService {
    AppUser getUserByUsername(String username);
}
