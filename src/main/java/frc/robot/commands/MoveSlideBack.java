package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class MoveSlideBack extends InstantCommand {
    @Override
    protected void execute() {
        Robot.slideSystem.setPosition(100);
    }
}