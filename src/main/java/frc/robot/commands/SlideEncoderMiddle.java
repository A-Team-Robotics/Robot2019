package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;

import frc.robot.Robot;

public class SlideEncoderMiddle extends InstantCommand{
    @Override
    protected void execute() {
        Robot.slideSystem.setPID(1500);
    }
}