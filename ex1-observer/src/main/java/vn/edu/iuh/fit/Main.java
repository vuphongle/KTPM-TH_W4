package vn.edu.iuh.fit;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();

        // Tạo sinh viên
        Student student1 = new Student("Sinh viên A");
        Student student2 = new Student("Sinh viên B");
        Student student3 = new Student("Sinh viên C");

        // Đăng ký sinh viên nhận thông báo
        classRoom.attach(student1);
        classRoom.attach(student2);
        classRoom.attach(student3);

        // Lớp trưởng gửi thông báo
        System.out.println("Lớp trưởng gửi thông báo:");
        classRoom.setMessage("Thông báo: Học kỳ mới bắt đầu!");

        // Lớp trưởng gửi thông báo khác
        System.out.println("\nLớp trưởng gửi thông báo khác:");
        classRoom.setMessage("Thông báo: Có lịch thi mới!");

        // Hủy đăng ký sinh viên B và gửi thông báo mới
        System.out.println("\nHủy đăng ký sinh viên B và gửi thông báo mới:");
        classRoom.detach(student2);
        classRoom.setMessage("Thông báo: Thay đổi thời gian học!");
    }
}