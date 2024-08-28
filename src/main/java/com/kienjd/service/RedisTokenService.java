package com.kienjd.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.kienjd.exception.InvalidDataException;
import com.kienjd.model.RedisToken;
import com.kienjd.repository.RedisTokenRepository;

@Service
@RequiredArgsConstructor
public class RedisTokenService {
    private final RedisTokenRepository redisTokenRepository;

    public void save(RedisToken token) {
        redisTokenRepository.save(token);
    }

    public void remove(String id) {
        isExists(id);
        redisTokenRepository.deleteById(id);
    }

    public boolean isExists(String id) {
        if (!redisTokenRepository.existsById(id)) {
            throw new InvalidDataException("Token not exists");
        }
        return true;
    }
}
