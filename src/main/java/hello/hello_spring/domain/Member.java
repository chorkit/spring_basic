package hello.hello_spring.domain;

public class Member {

    private Long id;        //실제 유저의 ID가아닌 시스템상에서 구분하기위한 ID임
    private String name;    //유저의 이름



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
