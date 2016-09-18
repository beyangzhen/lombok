package lombok;

/**
 *	 导入jar包后，方式一： jar包里的lombok.launch.Main.class, 右键运行
 *			       方式二： 点击Run Configurations->Java Application，右键new后，在Main class下添加launch.Main.class，再install/update，在run运行按钮
 *			       方式三：cmd命令行里运行 java -jar lombok.jar 
 * 			       方式四：eclipse的eclipse.ini文件中配上：-javaAgent:lombok.jar
 *  
 *   lombok作用：构造器、getter、setter、 toString()、 hashcode()、 equals()、 清理流对象
 *
 */

@Data      							   // 所有属性的所有方法和无参构造器
// @Setter 							   // 所有属性的setter方法
// @Getter
// @NoArgsConstructor       		   // 无参构造器
// @RequiredArgsConstructor 		   // 结合@NonNull，有参构造器
// @AllArgsConstructor				   // 所有属性的有参构造器
// @EqualsAndHashCode  				   // equals()和hashCode()
// @EqualsAndHashCode(callSuper=false) // 继承的子类中，equals()和hashCode()
// @ToString                		   // toString()
public class User {
	// @Setter 						   // 单个属性的setter方法
	@NonNull
	private String username;
	private String password;
	private int age;
	
}
