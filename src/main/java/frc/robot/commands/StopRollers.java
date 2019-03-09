package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class StopRollers extends InstantCommand{
    public StopRollers(){
        requires(Robot.arm);
    }
    @Override
    protected void initialize() {
        Robot.arm.stopRollers();
        Robot.arm.closeArms();
    }
    @Override
    protected void execute() {
        Robot.arm.stopRollers();
    }
}