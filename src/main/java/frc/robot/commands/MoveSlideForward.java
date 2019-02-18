package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class MoveSlideForward extends Command {
    @Override
    protected void execute() {
        Robot.slideSystem.moveFront();
    }

    @Override
    protected void initialize() {
        Robot.slideSystem.moveFront();
    }

    @Override
    protected boolean isFinished() {
        if(!Robot.slideSystem.getForwardLimit()){
            return false;
        }else{
            return true;
        }
    }
}