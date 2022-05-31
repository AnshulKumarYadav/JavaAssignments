package com.objectCollaboration;


	class Show{
		
		public static void main(String[] args) {
			
//			<<------------------------zero argument constructor set the values-------------------------------->>
			Students student1 = new Students();
			student1.setRoll(15);
			student1.setAge(34);
			student1.setMarks(435);
			student1.setName("Ramu");
			student1.showDetails();
//			<<---------------------------------parameterized constructor set the values---------------------->>
			Students student2 = new Students(23,"Ruturaj",65,600);
			student2.showDetails();
			
		}
		
	}

