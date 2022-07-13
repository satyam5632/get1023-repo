package view;

import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import model.Student;

public class StudentAppView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Student \n 2. Admin");
		int userType = sc.nextInt();

		if (userType == 1) {
			String choice = "y";
			do {
				System.out.println("1. Sign Up\n 2. Update phoone no\n 3. View all courses\n 4.Register for a course"
						+ "\n 5.Sign out");

				int option = sc.nextInt();
				switch(option) {
				case 1:
					System.out.println("Enter namr,date of birth,phone,email and address");
					String name=sc.next();
					String dateOfBirth=sc.next();
					DateTimeFormatter formatter=
				}

			} while (choice == "y" || choice == "Y");
		} else if (userType == 2) {
			System.out.println("1. View All Users");
			int options = sc.nextInt();

			switch (option) {

			case 1:
				List<Student> students = controller.viewAllStudents();
				Iterator<Student> iterator = students.iterator();
				while (iterator.hasNext()) {

					Student st = iterator.next();
					System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getQualification());

				}
				break;
			case 2:
				System.out.println("Enter rollNo:");
				int rollNo=sc.nextInt();
				Student st=controller.findStudentByRollNo(rollNo);
				if(st !=null) {
					System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getQualification());
				} else {
					System.out.println("ROll no not found");
				}

			}

		} else {
			//System.out.println("Invalid choice.");
			System.exit(0);
		}

	}

}
