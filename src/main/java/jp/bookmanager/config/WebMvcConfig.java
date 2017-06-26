package jp.bookmanager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration // declare a spring bean
@EnableWebMvc // to use assets such us image, css, js
public class WebMvcConfig extends WebMvcConfigurerAdapter{

	// Configure to use static assets
	@Override 
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(31556926);
		registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(31556926);
		registry.addResourceHandler("js/**").addResourceLocations("/js/").setCachePeriod(31556926);
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}


/**
 * @Autowired: automatically connect bean in classes and bean in spring container
 * 
 * @Scope: define scope for components, almost is singleton - generate only one object in memory
 * 
 * @Component: to scan springs components
 * 
 * @Repository: dung danh dau cac lop Dao
 * 
 * @Service: dung danh dau cac lop Service: xu ly logic
 * 
 * @Transactional: dung danh dau cac class co su dung transaction 
 * 
 * @Controller: dung danh dau controller: xu ly request den mot trang nao do trong lop nay
 * 
 * @RequestMapping: dung de map voi url trong class
 * 
 * @RequestParam: dung de gan parameter cua request vao method
 * 
 * @SessionAttribute: chi dinh mot model attribute se duoc luu vao session
 * 
 * @InitBinder: dung danh dau mot phuong thuc co tuy bien cac rang buoc du lieu
 * 
 * @PreAuthorize: dung de cho phep hoac tu choi su dung mot phuong thuc, 
 * 				chi cho doi tuong co quyen nam trong annotation nay su dung phuong thuc do ma thoi
 * 				@PreAuthorize("hasRole('ADMIN')")
 * 				public void removeContact(int id) { contactDao.removeContact(id); }
 * 
 */

/**
 * @Autowired: tu dong lien ket cac bean trong class
 * 				@Service
 * 				public class BookServiceImpl implements BookService {
 * 					@Autowired
 * 					private BookDao bookDao;
 * 					@Autowired 
 * 					private CustomerDao customerDao;
 * 				}
 * 
 * @Scope("request") // chi ap dung trong pham vi cac request tu client
 * public class ContactResource {}
 * 
 * @Component // scan cac component
 * public class ContactResource {}
 * 
 * 
 * @Repository  //chi ra rang day la lop Dao, chi no moi nen duoc truy cap vao db
 * public class BookDaoImpl implements BookDao {}
 * 
 * 
 * @Service // chi ra rang day la lop service, xu ly logic
 * public class BookServiceImpl implements BookService {}
 * 
 * @Controller // chi ra rang day la lop controller
 * public class LoginController {}
 * 			// trong @Controller nen co @RequestMapping toi url cua request
 * 
 * 
 * 
 * */

