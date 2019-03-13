package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class RecieveCargo extends InstantCommand {
    public RecieveCargo(){
        requires(Robot.gripperSystem);
    }
    
    @Override
    protected void execute() {
        Robot.gripperSystem.recieveCargo();
    }
}