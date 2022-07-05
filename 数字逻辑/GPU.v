`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 2019/11/27 16:47:37
// Design Name: 
// Module Name: GPU1
// Project Name: 
// Target Devices: 
// Tool Versions: 
// Description: 
// 
// Dependencies: 
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
//////////////////////////////////////////////////////////////////////////////////


module GPU1(
    input w,
    input clk3hz,
    input clr,
    input [31:0]number,
    input finish,
    output[15:0]dataBus
    );
    reg[31:0]msgArray;
    wire [15:0] dataBus1;
    assign dataBus = w ? dataBus1 : 16'haaaa;
    assign dataBus1 = finish ? msgArray[31:16] : 16'haaaa;
    always@(posedge clk3hz or negedge clr)
    if(!clr)
        msgArray<=number;
    else begin
        msgArray[3:0]<=msgArray[31:28];
        msgArray[31:4]<=msgArray[27:0];
    end
endmodule
