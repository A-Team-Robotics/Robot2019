package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class StartRollers extends InstantCommand{
    public StartRollers(){
        requires(Robot.arm);
    }
    @Override
    protected void initialize() {
            Robot.arm.setRollersForward();
            Robot.arm.openArms();
    }
}