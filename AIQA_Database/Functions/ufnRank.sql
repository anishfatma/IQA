SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE FUNCTION [dbo].[ufnRank](@C2 VARCHAR(50))  
RETURNS INT
AS   
-- Returns the stock level for the product. 
BEGIN  
        DECLARE @ret INT;  
		SELECT @ret = C1 from Test WHERE C2=@C2
   
    RETURN @ret
END; 
GO