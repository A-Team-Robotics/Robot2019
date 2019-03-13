package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class openArm extends InstantCommand {
    public openArm(){
        requires(Robot.arm);
    }
    
    @Override
    protected void execute() {
        Robot.arm.openArms();
    }

}