class Developer implements Employee {

    private final String JOB;
    private String skill;
    
    public Developer() {
      // INTRINSIC
      JOB = "Fix the issue";
    }
    
    @Override
    public void assignSkill(String skill) {
      // EXTRINSIC
      this.skill = skill;
    }
  
    @Override
    public void task() {
      System.out.println("Developer with skill: " + this.skill + " with Job: " + JOB);
    }
    
  }
  
  