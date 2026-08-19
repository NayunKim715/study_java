package ex2_set_get;

public class Person {
    
    //String gender = "남자"//라고 기본값 설정하면 성인지 감수성 떨어지는거니까
    //private String gender = "남자"; //완전한 보안을 유지하면서 값까지 바꿀 순 없어요
    private String gender;

    public void setGender( String s ){ //String에 s라는 파라미터를 하나 받음
        gender = s;
    }
  
    public String getGender(){
        return gender;
    }

    private String name;
    public void setName( String n ){
        name = n;
    }

    public String getName(){
        return name;
    }
    
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge( int a ){
        age = a;
        
    }
}
/*
Person 클래스는 사람 한 명의 정보를 저장하는 역할을 해요.
이 클래스에는 성별(gender), 이름(name), 그리고 나이(age)라는 정보가 있어요.

이 정보들은 클래스의 맨 위에 private로 선언돼 있어요. 
이 뜻은, 클래스 바깥에서는 gender, name, age라는 정보를 직접 바꿀 수도, 읽을 수도 없다는 뜻이에요.
보안을 위해서 이렇게 해요.

그 대신, 정보를 바꾸거나(getter/setter) 읽을 때 꼭 메소드를 통해 해야 해요.

--- 메소드 설명 ---
예를 들어,
- public void setGender(String s) { ... }
여기서 'void'는 '이 메소드는 아무런 값을 돌려주지 않는다'라는 뜻이에요.
즉, 이 메소드는 gender 값을 바꾸기만 하지, 결과 같은 건 주지 않아요.
setName(String n), setAge(int a)도 똑같아요. 
이것들은 값을 넣어주는(=저장하는) 것만 하고, 아무 결과도 return하지 않아요.

반대로,
- public String getGender() { ... }
이렇게 'String'이 들어가 있으면, 이 메소드는 String(=문자열) 값을 돌려준다는 뜻이에요.
즉, getGender()를 호출하면 gender의 값을 알려줘요.
getName()은 String, getAge()는 int(정수)를 return해서 값을 알려준다는 뜻이에요.

--- 요약 ---
- void: 돌려주는 값 없음 (그저 시키는 일만 함)
- String/int 등: 돌려주는 값 있음 (결과를 받아볼 수 있음)

setter(정보를 저장) - set~~ : void (값만 넣고, 준 결과는 없음)
getter(정보를 읽음) - get~~ : return값 있음 (값을 알려줌)

예시) 
Person p = new Person();
p.setAge(20);   // 나이 20으로 저장. (아무 결과 안 돌려줌)
int x = p.getAge(); // p의 나이 값을 꺼내서 x에 넣음

이렇게 set~ 메소드는 값을 바꿔주고 끝, get~ 메소드는 값을 읽어서 결과로 알려줘요!
*/