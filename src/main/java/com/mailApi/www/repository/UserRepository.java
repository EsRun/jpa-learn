package com.mailApi.www.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mailApi.www.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{
	List<UserModel> findById(long id);
	List<UserModel> findByTeamAndDelCheck(int id, int flag);
	List<UserModel> findByTeamInAndDelCheck(Collection<Integer> teams, int flag);
	
}
