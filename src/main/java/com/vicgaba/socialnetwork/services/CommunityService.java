package com.vicgaba.socialnetwork.services;

import com.vicgaba.socialnetwork.dto.ImageDto;
import com.vicgaba.socialnetwork.dto.MessageDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

@Service
public class CommunityService {

    public List<MessageDto> getCommunityMessages(int page){
        return Arrays.asList(new MessageDto(1L, "First message"),
                new MessageDto(2L, "Second message"));
    }

    public List<ImageDto> getCommunityImages(int page){
        return Arrays.asList(new ImageDto(1L, "First image", null),
                new ImageDto(2L, "Second image", null));

    }

    public MessageDto postMessage(MessageDto messageDto){
        return new MessageDto(3L, "New message");
    }

    public ImageDto postImage(MultipartFile file, String title){
        return new ImageDto(3L, "New Tittle", null);
    }
}
