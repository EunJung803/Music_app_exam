package com.ll.exam.music_app.app.base.initData;

import com.ll.exam.music_app.app.cart.service.CartService;
import com.ll.exam.music_app.app.member.service.MemberService;
import com.ll.exam.music_app.app.product.service.ProductService;
import com.ll.exam.music_app.app.song.service.SongService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData implements InitDataBefore {
    @Bean
    CommandLineRunner initData(MemberService memberService, SongService songService, ProductService productService, CartService cartService) {
        return args -> {
            before(memberService, songService, productService, cartService);
        };
    }
}