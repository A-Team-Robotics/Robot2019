package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class StopArmRollers extends InstantCommand{
    public StopArmRollers(){
        requires(Robot.arm);
    }
    @Override
    protected void initialize() {
        Robot.arm.stopRollers();
    }
}