package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class RunRollersFast extends InstantCommand{
    public RunRollersFast(){
        requires(Robot.arm);
    }
    @Override
    protected void initialize(){
        Robot.arm.fastLoad();
    }
    
}