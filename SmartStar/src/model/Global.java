package model;
import java.util.ArrayList;

public class Global {

	private ArrayList<User> userList = new ArrayList<>();
	private ArrayList<Course> courseList = new ArrayList<>();
	
	public ArrayList<User> getUserList() {
		return userList;
	}

	public ArrayList<Course> getCourseList() {
		return courseList;
	}
	
	public boolean addUser(User user) {
		if (userList.contains(user)) {
			return false;
		}
		return userList.add(user);
	}
	
	public boolean deleteUser(User user) {
		return userList.remove(user);
	}

	public boolean addCourse(Course course) {
		if (courseList.contains(course)) {
			return false;
		}
		return courseList.add(course);
	}
	
	public boolean deleteCourse(Course course) {
		return courseList.remove(course);
	}
	
	/**
	 * 
	 * @param username
	 * @return Username exist: return the user object;
	 * Username not exist: return null.
	 */
	public User getUserByUsername(String username) {
		for (User user : userList) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param courseName
	 * @return courseName exist: return the user object;
	 * courseName not exist: return null.
	 */
	public Course getCourseByCourseName(String courseName) {
		for (Course course : courseList) {
			if (course.getCourseName().equals(courseName)) {
				return course;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param id
	 * @return course ID exist: return the user object;
	 * course ID not exist: return null.
	 */
	public Course getCourseByCourseID(String id) {
		for (Course course : courseList) {
			if (course.getCourseID().equals(id)) {
				return course;
			}
		}
		return null;
	}

	public boolean detetermineCourseExists(String courseID){
		for(Course c: courseList){
			if(c.getCourseID().equals(courseID)){
				return true;
			}
		}
		return false;
	}

	public boolean detetermineCourseExistsByName(String courseName){
		for(Course c: courseList){
			if(c.getCourseName().equals(courseName)){
				return true;
			}
		}
		return false;
	}


}
