package LogicalFeeReceieptSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class DaoImpl implements Dao {

	int con;

	@Override
	public void insert(Bean bean, Scanner sc, LinkedList<Bean> list) {

		while (true) {
			bean = new Bean();
			System.out.println("1.  Enter Student's Name");
			sc.nextLine();
			String name = sc.nextLine();

			for (;;) {
				System.out.println("2.  Enter Student's Mobile Number");
				long mobile = sc.nextLong();
				if (mobile > 999999999l && mobile <= 9999999999l) {
					bean.setMobile(mobile);
					break;
				} else {
					System.out.println("Mobile Number Must Have 10 numbers");
				}
			}

			try {
				while (true) {
					System.out.println("3.  Enter Student's Cousre");
					System.out.println("java/c++/python");
					String course = sc.next();
					if (course.equalsIgnoreCase("c++")) {
						bean.setCourse(course);
						System.out.println("Fees Of C++ Is 25000 ");
						bean.setCourseFee(25000);
						for (;;) {
							System.out.println("4.  Enter paid fee");
							long fee = sc.nextLong();
							if (fee <= 25000) {
								bean.setPaid_fee(fee);
								break;
							} else {
								System.out.println("Enter Value Upto 25000");
							}
						}
						break;
					} else if (course.equalsIgnoreCase("java")) {
						bean.setCourseFee(30000);
						System.out.println("Fees Of Java Is 30000 ");
						bean.setCourse(course);
						for (;;) {
							System.out.println("4.  Enter paid fee");
							long fee = sc.nextLong();
							if (fee <= 30000) {
								bean.setPaid_fee(fee);
								break;
							} else {
								System.out.println("Enter Value Upto 30000");
							}
						}
						break;
					} else if (course.equalsIgnoreCase("python")) {
						bean.setCourseFee(40000);
						System.out.println("Fees Of Python Is 40000 ");
						bean.setCourse(course);
						for (;;) {
							System.out.println("4.  Enter paid fee");
							long fee = sc.nextLong();
							if (fee <= 40000) {
								bean.setPaid_fee(fee);
								break;
							} else {
								System.out.println("Enter Value Upto 40000");
							}
						}
						break;
					} else {
						System.out.println("Please Enter Valid Input We Dont Have " + course + " Option ");
					}
				}
			} catch (Exception e) {
				System.out.println("Please Enter Valid Data");
			}

			try {
				for (;;) {
					System.out.println("5.  Enter Date of Joing ");
					String date_of_join;
					for (;;) {
						System.out.println("Enter Date");
						int date = sc.nextInt();
						if (date <= 31) {
							date_of_join = date + "/";
							break;
						} else {
							System.out.println("Enter Valid Date");
						}
					}
					for (;;) {
						System.out.println("Enter MontH In Number");
						int month = sc.nextInt();
						if (month <= 12) {
							date_of_join = date_of_join + month + "/";
							break;
						} else {
							System.out.println("Enter Valid Month");
						}
					}
					for (;;) {
						System.out.println("Enter Year");
						int Year = sc.nextInt();
						if (Year <= 2023) {
							date_of_join = date_of_join + Year;
							break;
						} else {
							System.out.println("Enter Valid Year");
						}
					}
					bean.setDate_of_joing(date_of_join);
					break;

				}
			} catch (Exception e) {
				System.out.println("Please Enter Valid Data");

			}

			try {
				System.out.println("6.  Enter Paymant Mode");
				while (true) {
					System.out.println("1.CasH/2.OnlinE");
					String mode = sc.next();
					if (mode.equals("1")) {
						bean.setPaymant_mode("CasH");
						break;
					} else if (mode.equals("2")) {
						bean.setPaymant_mode("OnlinE");
						break;
					} else {
						System.out.println("We Have Only 2 Option ");
					}

				}

			} catch (Exception e) {
				System.out.println("Please Enter Valid Data");
			}

			con++;
			bean.setSerial_number(con);
			bean.setName(name);

			list.add(bean);
			System.out.println("save succesfully");
			System.out.println("Do you Want To Add More Data");
			sc.nextLine();
			String in = sc.nextLine();
			if (in.equalsIgnoreCase("n")) {
				break;
			}

		}
	}

	@Override
	public void update(Bean bean, Scanner sc, LinkedList<Bean> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void generate_receipt(Bean bean, Scanner sc, LinkedList<Bean> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Bean bean, Scanner sc, LinkedList<Bean> list) {
		// TODO Auto-generated method stub

	}

}
