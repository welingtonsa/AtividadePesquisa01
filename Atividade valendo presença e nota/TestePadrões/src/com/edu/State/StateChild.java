package com.edu.State;

public class StateChild {
    /* Atributos da classe StateChald */
    private int age;
    private ContextChild contextChild;

    /* Metodo construtor */
    public StateChild(int age){
        this.setAge(age);
    }

    /* Metodos da classe StateChild */
    public void play(){
        contextChild.play();
    }

    public void eat(){
        contextChild.eat();
    }

    /* Metodos getters and setters */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age == 1) {
            contextChild = new FistYearChild();
        } else {
            contextChild = new SecondYearChild();
        }
    }

    public ContextChild getContextChild() {
        return contextChild;
    }

    public void setContextChild(ContextChild contextChild) {
        this.contextChild = contextChild;
    }
    
}
