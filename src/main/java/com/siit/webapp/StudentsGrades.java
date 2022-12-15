package com.siit.webapp;

public class StudentsGrades {

    private float math;
    private float physics;
    private float economics;
    private float chemistry;

    public StudentsGrades(float math, float physics, float economics, float chemistry) {
        this.math = math;
        this.physics = physics;
        this.economics = economics;
        this.chemistry = chemistry;
    }

    public float getMath() {
        return math;
    }

    public float getPhysics() {
        return physics;
    }

    public float getEconomics() {
        return economics;
    }

    public float getChemistry() {
        return chemistry;
    }
}
