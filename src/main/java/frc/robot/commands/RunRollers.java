package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class RunRollers extends InstantCommand{
    public RunRollers(){
        requires(Robot.arm);
    }
    @Override
    protected void initialize() {
            Robot.arm.setRollersForward();
    }
}