package com.bootsample.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import com.bootsample.entity.User;

public class AccountUserDetails implements UserDetails {
	private final User user;

    public AccountUserDetails(User user) {
        this.user = user;
    }

    public User getUser() { // --- (1) Entityである Userを返却するメソッド
        return user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { // --- (3) ユーザに与えられている権限リストを返却するメソッド
        return AuthorityUtils.createAuthorityList("ROLE_USER");
    }

    @Override
    public String getPassword() { // --- (4) 登録されているパスワードを返却するメソッド
        return this.user.getPassword();
    }

    @Override
    public String getUsername() { // --- (5) ユーザ名を返却するメソッド
        return this.user.getId();
    }

    @Override
    public boolean isAccountNonExpired() { // --- (6) アカウントの有効期限の状態を判定するメソッド
        return true;
    }

    @Override
    public boolean isAccountNonLocked() { // --- (7) アカウントのロック状態を判定するメソッド
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() { // --- (8) 資格情報の有効期限の状態を判定するメソッド
        return true;
    }

    @Override
    public boolean isEnabled() { // --- (9) 有効なユーザかを判定するメソッド
        return true;
    }
}
