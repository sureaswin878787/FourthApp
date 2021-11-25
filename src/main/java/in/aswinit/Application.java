package in.aswinit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.aswinit.entity.UserEntity;
import in.aswinit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		UserRepository repository=context.getBean(UserRepository.class);
		
		System.out.println("findByemail");
		UserEntity entity=repository.findByuserEmail("abc@gmail.com");
		System.out.println(entity);
		
		System.out.println("findByAgeGreaterThan");
		List<UserEntity> entities=repository.findByuserAgeGreaterThan(22);
		entities.forEach(u->System.out.println(u));
		
		System.out.println("findByAge");
		List<UserEntity> entities1=repository.findByuserAge(23);
		entities1.forEach(u->System.out.println(u));
		
		System.out.println("findByEmailAndUname");
		UserEntity entity1=repository.findByUserEmailAndUserName("def@gmail.com", "def");
		System.out.println(entity1);
	}

}
