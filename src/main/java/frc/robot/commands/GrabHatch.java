package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.Robot;

public class GrabHatch extends InstantCommand {
    public GrabHatch() {
        requires(Robot.gripperSystem);
    }
    @Override
    protected void execute() {
        Robot.gripperSystem.grabHatch();
        Robot.loadItem = "hatch";
        Scheduler.getInstance().add(new SlideBack());
    }
}