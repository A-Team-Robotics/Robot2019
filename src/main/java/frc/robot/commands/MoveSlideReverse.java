package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class MoveSlideReverse extends Command {
    @Override
    protected void execute() {
        Robot.slideSystem.moveReverse();
    }

    @Override
    protected void initialize() {
        Robot.slideSystem.moveReverse();
    }

    @Override
    protected boolean isFinished() {
        if(!Robot.slideSystem.getReverseLimit()){
            return true;
        }else{
            return false;
        }
    }
}