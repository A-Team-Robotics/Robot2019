package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;

import frc.robot.Robot;

public class SlideEncoderFront extends InstantCommand{
    @Override
    protected void execute() {
        Robot.slideSystem.setPID(3000);
    }
}