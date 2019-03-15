//package controller;
//
//import dao.DAOLogin;
//import entity.Student;
//import main.main;
//import org.json.simple.JSONObject;
//import security.JwtGenerator;
//
//public class LoginController extends Handler {
//
//    @Override
//    public String doProcessGet(String param,String token) {
//        return null;
//    }
//
//    @Override
//    public String errorToken(String param) {
//        return null;
//    }
//
//    @Override
//    public String doProcessPost(JSONObject params) {
//        DAOLogin daoLogin = new DAOLogin(main.conn);
//        Student student = new Student();
//        JSONObject js = new JSONObject();
//        JwtGenerator jwtGenerator = new JwtGenerator();
//
//        try {
//            student.setIdStudent(Integer.parseInt(params.get("idstudent").toString()));
//            student.setNameStudent(params.get("student_name").toString());
//            student.setPassword(params.get("password").toString());
//        } catch (Exception e) {
//            js.put("rc", "-1");
//            js.put("rd", e.toString());
//            return js.toString();
//        }
//        String token =jwtGenerator.generate(student);
//
//        //update token
//        daoLogin.updateToken(student,token);
//
//        if (daoLogin.login(student) == 1) {
//            daoLogin.ckeck(student);
//            js.put("rc", "1");
//            js.put("rd", "Login success");
//            js.put("token",token);
//        } else {
//            js.put("rc", "-1");
//            js.put("rd", "Err");
//        }
//
//        return js.toString();
//    }
//
//    @Override
//    public String doProcessPut(JSONObject params) {
//        return null;
//    }
//
//    @Override
//    public String doProcessDelete(String param) {
//        return null;
//    }
//}
