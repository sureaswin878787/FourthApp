package in.aswinit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.aswinit.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity,Serializable>{
	public UserEntity findByuserEmail(String email);
	public List<UserEntity> findByuserAgeGreaterThan(Integer age);
	public List<UserEntity> findByuserAge(Integer age);
	public UserEntity findByUserEmailAndUserName(String userEmail,String userName);
}
