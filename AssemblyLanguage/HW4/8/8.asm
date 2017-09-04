INCLUDE Irvine32.inc
.data
   InputArray Byte "This is a Plaintext message",0
   KeyArray Byte "ABXmv#7",0
   EncryptMsg Byte "Encrypt Massage: ",0
   DecryptMsg Byte "Decrypt Massage: ",0
.code
main PROC
   mov edx,OFFSET EncryptMsg
   Call WriteString 
   Call Crlf
   Call Encrypt
   mov edx,OFFSET DecryptMsg
   Call WriteString 
   Call Crlf
   Call  Encrypt ;再做一次，程式內容相同
   Exit
main ENDP


Encrypt PROC
   mov ecx,sizeof    InputArray      ;取inputArray的個數
     mov esi,offset  InputArray      ;esi指向InputArray 

   Continue:                               ;重頭開始讀
	 mov edi,offset KeyArray           ;edi指向KeyArray
	 dec ecx
   L1:
	  mov al,[esi]
	  xor al,[edi]                     ;做XOR
	  mov [esi],al
	  inc esi
	  inc edi

	  cmp esi,offset InputArray+lengthof InputArray-1;比較是否到達InputArray的尾巴
          je PrintResult                                   ; Jump to final if equal
	  cmp edi,offset KeyArray+lengthof KeyArray-1    ;比較是否到達 KeyArray的尾巴
		  je Continue                                    ;jump to next if equal

	  Loop L1
   PrintResult:
	    mov edx,OFFSET InputArray
	    Call WriteString
		Call Crlf
		
	Ret
Encrypt ENDP


END main