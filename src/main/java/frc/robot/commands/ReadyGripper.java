package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class ReadyGripper extends InstantCommand {
    public ReadyGripper(){
        requires(Robot.gripperSystem);
    }
    
    @Override
    protected void execute() {
        Robot.loadItem = "ball";
        Robot.gripperSystem.loadBall();
    }

}