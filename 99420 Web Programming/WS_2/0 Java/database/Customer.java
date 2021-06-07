package net.stou.database;

public class Customer {
	String profilename, firstname,lastname,phone;

		public Customer(String profilename, String firstname, String lastname, String phone) {
			super();
			this.profilename = profilename;
			this.firstname = firstname;
			this.lastname = lastname;
			this.phone = phone;
		}

		public String getProfilename() {
			return profilename;
		}

		public void setProfilename(String profilename) {
			this.profilename = profilename;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "Customer [profilename=" + profilename + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", phone=" + phone + "]";
		}

	}

