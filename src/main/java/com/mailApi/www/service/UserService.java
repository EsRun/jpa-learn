package com.mailApi.www.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mailApi.www.model.UserModel;
import com.mailApi.www.repository.UserRepository;

@Service
public class UserService{
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<UserModel> getUserList(long id){
		return userRepository.findById(id);
	}
	
	public List<UserModel> getList(int id, int flag){
		return userRepository.findByTeamAndDelCheck(id, flag);
	}
	
	public List<UserModel> getListAll(List<Integer> teams, int flag){
		return userRepository.findByTeamInAndDelCheck(teams, flag);
	}
}
