package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class RecieveHatch extends InstantCommand {
    public RecieveHatch() {
        requires(Robot.gripperSystem);
    }
    @Override
    protected void execute() {
        Robot.gripperSystem.recieveHatch();
    }
}