package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class StopRollers extends InstantCommand{
    public StopRollers(){
        requires(Robot.ballCollector);
    }
    @Override
    protected void initialize() {
        Robot.ballCollector.stopRollers();
    }
    @Override
    protected void execute() {
        Robot.ballCollector.stopRollers();
    }
}