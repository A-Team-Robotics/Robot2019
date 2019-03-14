package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class DeployHatch extends InstantCommand {
    public DeployHatch(){
        requires(Robot.gripperSystem);
    }
    
    @Override
    protected void execute() {
        Robot.gripperSystem.deployHatch();
        Robot.loadItem = "ball";
    }
}